import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Document {
    private int id;
    private String title;
    private String folderName;
    private int pages;

    public Document(int id, String title, String folderName, int pages) {
        this.id = id;
        this.title = title;
        this.folderName = folderName;
        this.pages = pages;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getFolderName() {
        return folderName;
    }

    public int getPages() {
        return pages;
    }

    // Override toString for easy display of Document details
    @Override
    public String toString() {
        return id + " " + title + " " + folderName + " " + pages;
    }
}

class Solution {
    private static Document[] docsWithOddPages(Document[] documents) {
        List<Document> oddPageDocs = new ArrayList<>();

        // Collect documents with odd number of pages
        for (Document doc : documents) {
            if (doc.getPages() % 2 != 0) {
                oddPageDocs.add(doc);
            }
        }

        // Sort documents with odd pages by id in ascending order
        oddPageDocs.sort((d1, d2) -> Integer.compare(d1.getId(), d2.getId()));

        // Convert List to Array and return
        return oddPageDocs.toArray(new Document[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Document[] documents = new Document[4];

        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine(); 
            String title = sc.nextLine();
            String folderName = sc.nextLine();
            int pages = sc.nextInt();
            documents[i] = new Document(id, title, folderName, pages);
        }

        Document[] oddPageDocs = docsWithOddPages(documents);
        for (Document doc : oddPageDocs) {
            System.out.println(doc);
        }

        sc.close();
    }
}
