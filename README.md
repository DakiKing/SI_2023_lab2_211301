SI_Lab2_211301

CFG (Control Flow Graph )

![silab2 drawio](https://github.com/DakiKing/SI_2023_lab2_211301/assets/108428271/47318d92-a525-406d-8613-87b9c3e2c57f)

Цикломатската комплексност

Edges (E):

Е = 24

Nodes (N):

N = 15

Користејќи ја формулата V(G) = E - N + 2, можеме да ја пресметаме цикломатската сложеност:

V(G) = 24 - 15 + 2
V(G) = 11

Цикломатската сложеност на дадениот CFG е 11.

<table><thead><tr><th>Branch</th><th>Completed</th></tr></thead><tbody><tr><td>[2]</td><td>*</td></tr><tr><td>[4]</td><td>*</td></tr><tr><td>[7]</td><td>*</td></tr><tr><td>[9]</td><td>*</td></tr><tr><td>[11]</td><td>*</td></tr><tr><td>[13]</td><td>*</td></tr><tr><td>[18]</td><td>*</td></tr><tr><td>[20]</td><td>*</td></tr><tr><td>[21]</td><td>*</td></tr><tr><td>[22]</td><td>*</td></tr></tbody></table>

<ol>
    <li>Гранка [2] е завршена кога условот (user == null || user.getPassword() == null || user.getEmail() == null) е точен.</li>
    <li>Гранка [4] е завршена кога условот user.getUsername() == null е точен.</li>
    <li>Гранка [7] е завршена кога условот user.getEmail().contains("@") && user.getEmail().contains(".") е точен.</li>
    <li>Гранка [9] е завршена кога условот i < allUsers.size() за циклусот е точен.</li>
    <li>Гранка [11] е завршена кога условот existingUser.getEmail() == user.getEmail() е точен.</li>
    <li>Гранка [13] е завршена кога условот existingUser.getUsername() == user.getUsername() е точен.</li>
    <li>Гранка [18] е завршена кога условот passwordLower.contains(user.getUsername().toLowerCase()) || password.length() < 8 е точен.</li>
    <li>Гранка [20] е завршена кога условот !passwordLower.contains(" ") е точен.</li>
    <li>Гранка [21] е завршена кога условот i < specialCharacters.length() за циклусот е точен.</li>
    <li>Гранка [22] е завршена кога условот password.contains(String.valueOf(specialCharacters.charAt(i))) е точен.</li>
</ol>


Multiple Condition

Multiple Condition критериумот на условот if (user == null || user.getPassword() == null || user.getEmail() == null), треба да се разгледаат сите можни комбинации на true и false за секој дел од условот.

Во овој случај имаме три делови во условот:

user == null
user.getPassword() == null
user.getEmail() == null
Треба да ги разгледаме сите комбинации за овие делови и да ги формираме соодветните тест случаи. Вкупниот број на комбинации е 2^3 = 8.

<ol><li><code>user == null</code>, <code>user.getPassword() == null</code>, <code>user.getEmail() == null</code> - Сите делови се <code>true</code></li><li><code>user == null</code>, <code>user.getPassword() == null</code>, <code>user.getEmail() != null</code></li><li><code>user == null</code>, <code>user.getPassword() != null</code>, <code>user.getEmail() == null</code></li><li><code>user == null</code>, <code>user.getPassword() != null</code>, <code>user.getEmail() != null</code></li><li><code>user != null</code>, <code>user.getPassword() == null</code>, <code>user.getEmail() == null</code></li><li><code>user != null</code>, <code>user.getPassword() == null</code>, <code>user.getEmail() != null</code></li><li><code>user != null</code>, <code>user.getPassword() != null</code>, <code>user.getEmail() == null</code></li><li><code>user != null</code>, <code>user.getPassword() != null</code>, <code>user.getEmail() != null</code> - Сите делови се <code>false</code></li></ol>

# Објаснување на напишаните unit tests

testFunctionWithValidUser: <br />
Овој тест случај е дизајниран за да се тестира сценарио со валиден корисник. Креираме објект од класата User со валидно корисничко име, лозинка и е-пошта. Создаваме празна листа на allUsers, бидејќи го тестираме случајот кога корисникот е прв во системот. Го повикуваме методот function од класата SILab2 со создадениот корисник и празната листа на allUsers. Користиме assertTrue тврдењето за да провериме дали методот function враќа true за валидниот корисник. Овој тест случај ги покрива критериумите за валиден корисник без претходно постоечки корисници во системот.

testFunctionWithInvalidUser: <br />
Овој тест случај е дизајниран за да се тестира сценарио со невалиден корисник. Креираме објект од класата User со null корисничко име, слаба лозинка и валидна е-пошта. Создаваме празна листа на allUsers, бидејќи го тестираме случајот кога корисникот е прв во системот. Го повикуваме методот function од класата SILab2 со создадениот корисник и празната листа на allUsers. Користиме assertFalse тврдењето за да провериме дали методот function враќа false за невалидниот корисник. Овој тест случај ги покрива критериумите за невалиден корисник со недостасувачки задолжителни информации.
