import dao.IDAO;
import dao.ImpDAO;
import model.Author;
import model.Student;

public class Main {
    public static void main(String[] args) {
        /*Author author = new Author(1L, "3"); // initialize instance of author class
        IDAO dao = new ImpDAO(); // initialize dao instance of impdao class to use crud
        //Author author1 = dao.findById(author.getId(), Author.class);
        dao.create(author);
        //dao.update(author);
        //dao.delete(author1);
        System.out.println(dao.findAll(Author.class, "Author.all"));*/

        Student a = new Student(null, "A", "B");
        IDAO dao = new ImpDAO();
        dao.create(a);
        System.out.println(dao.findAll(Student.class, "Student.all"));
    }
}
