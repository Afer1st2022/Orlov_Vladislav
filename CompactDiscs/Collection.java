public class Collection {
    Disk[] collection;
    public void addDisk(Disk disk) {
        if (collection == null) {
            collection = new Disk[1];
            collection[0] = disk;
        } else {
            Disk[] a = collection;
            collection = new Disk[a.length + 1];
            for (int i = 0; i < a.length; i++) {
                collection[i] = a[i];
            }
            collection[a.length] = disk;
        }
    }
    public String toStringCollection() {
        String result = "";
        for (int i = 0; i <= collection.length - 1; i++) {
            result += ((i+1) + ". " + collection[i].type + " : " + collection[i].category + " : " + collection[i].description + "\n");
        }
        return result;
    }
    public static class Disk {
        String type;
        String category;
        String description;

        public Disk(String type, String category, String description) {
            this.type = type;
            this.category = category;
            this.description = description;
        }
    }
}
