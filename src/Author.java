class Author {
        
    private String name;
    private String bio;

    public Author(String name, String bio){
        this.name = name;
        this.bio = bio;
    }

    public String getName(){
        return name;
    }

    public String getBio(){
        return bio;
    }

    public void displayAuthorInfo(){
        System.out.println("Author: " + name);
        System.out.println("Biography: " + bio);
    }
}
