# JavaEE EJB - SOAP Web Service
Example of SOAP Web Service. 

### Session Bean
The PersonDao and PersonWS classes must be defined as a Session Bean. In this case, we define it as @Stateless.

### Web Service
The @WebService annotation should be used for web service classes. When it is necessary to use a service or a Dao, it is necessary to inject using the @Inject annotation.

```
@WebService
@Stateless
public class PersonWS {

  @Inject
  private PersonDao personDao;

  @WebResult(name = "persons")
  public List<Person> getAllPersons() {
    return personDao.getAll();
  }
}

```
The @WebResult (name = "name_defined") annotation in the method makes explicit the name of the returns.
The @WebParam (name = "name_defined") annotation in the parameters explicitly names the parameters.
