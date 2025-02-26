namespace BooksPatterns.creational.Singleton;

public class LibraryManager
{
    public static LibraryManager? example;
    private LibraryManager() { }
    public static LibraryManager Example=>example??= new LibraryManager();
    public void ShowMessage() => Console.WriteLine("Library Manager is running!");
}