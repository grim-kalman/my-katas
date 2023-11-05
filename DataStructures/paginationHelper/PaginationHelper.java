package dataStructures.paginationHelper;

import java.util.List;

public class PaginationHelper<I> {
    private List<I> collection;
    private int itemsPerPage;

    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    public int itemCount() {
        return collection.size();
    }

    public int pageCount() {
        return (int) Math.ceil((double) itemCount() / itemsPerPage);
    }

    public int pageItemCount(int pageIndex) {
        if (pageIndex < 0 || pageIndex >= pageCount()) {
            return -1;
        } else if (pageIndex < pageCount() - 1) {
            return itemsPerPage;
        } else {
            return itemCount() % itemsPerPage == 0 ? itemsPerPage : itemCount() % itemsPerPage;
        }
    }

    public int pageIndex(int itemIndex) {
        if (itemIndex < 0 || itemIndex >= itemCount()) {
            return -1;
        } else {
            return itemIndex / itemsPerPage;
        }
    }

    public static void main(String[] args) {
        List<Character> collection = List.of('a', 'b', 'c', 'd', 'e', 'f');
        PaginationHelper<Character> helper = new PaginationHelper<>(collection, 4);
        System.out.println(helper.pageCount()); // Should print 2
        System.out.println(helper.itemCount()); // Should print 6
        System.out.println(helper.pageItemCount(0)); // Should print 4
        System.out.println(helper.pageItemCount(1)); // Should print 2
        System.out.println(helper.pageItemCount(2)); // Should print -1
        System.out.println(helper.pageIndex(5)); // Should print 1
        System.out.println(helper.pageIndex(2)); // Should print 0
        System.out.println(helper.pageIndex(20)); // Should print -1

        collection = List.of('a', 'b', 'c', 'd');
        helper = new PaginationHelper<>(collection, 4);
        System.out.println(helper.pageItemCount(0)); // Should print 4
        helper = new PaginationHelper<>(collection, 1);
        System.out.println(helper.pageItemCount(3)); // Should print 1

        collection = List.of();
        helper = new PaginationHelper<>(collection, 10);
        System.out.println(helper.pageItemCount(0)); // Should print -1
    }
}
