package InventoryManagementSystem;

public class MediaItemFactory {
    public static MediaItem<?> createMediaItem(String type, String title, String author, int year, String specificInfo) {
        switch (type.toLowerCase()) {
            case "book":
                int pages = Integer.parseInt(specificInfo);
                return new Book(title, author, year, pages);
            case "magazine":
                int issue = Integer.parseInt(specificInfo);
                return new Magazine(title, author, year, issue);
            case "cd":
                return new CD(title, author, year, specificInfo); // specificInfo là thời gian phát
            case "dvd":
                return new DVD(title, author, year, specificInfo); // specificInfo là đạo diễn
            default:
                throw new IllegalArgumentException("Tài liệu không hợp lệ");
        }
    }
}
