namespace BooksPatterns.creational.Prototype;

public class ExactBook:BookPrototype
{
    public string Title { get; set; }
    public override BookPrototype Clone()=>(BookPrototype)MemberwiseClone();
}