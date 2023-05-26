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

Гранка [2] се завршува кога условот (user == null || user.getPassword() == null || user.getEmail() == null) е точен.
Гранка [4] се завршува кога условот user.getUsername() == null е точен.
Гранка [7] се завршува кога условот user.getEmail().contains("@") && user.getEmail().contains(".") е точен.
Гранка [9] се завршува кога условот i < allUsers.size() во циклусот е точен.
Гранка [11] се завршува кога условот existingUser.getEmail() == user.getEmail() е точен.
Гранка [13] се завршува кога условот existingUser.getUsername() == user.getUsername() е точен.
Гранка [18] се завршува кога условот passwordLower.contains(user.getUsername().toLowerCase()) || password.length() < 8 е точен.
Гранка [20] се завршува кога условот !passwordLower.contains(" ") е точен.
Гранка [21] се завршува кога условот i < specialCharacters.length() во циклусот е точен.
Гранка [22] се завршува кога условот password.contains(String.valueOf(specialCharacters.charAt(i))) е точен.

Multiple Condition

Multiple Condition критериумот на условот if (user == null || user.getPassword() == null || user.getEmail() == null), треба да се разгледаат сите можни комбинации на true и false за секој дел од условот.

Во овој случај имаме три делови во условот:

user == null
user.getPassword() == null
user.getEmail() == null
Треба да ги разгледаме сите комбинации за овие делови и да ги формираме соодветните тест случаи. Вкупниот број на комбинации е 2^3 = 8.

<ol><li><code>user == null</code>, <code>user.getPassword() == null</code>, <code>user.getEmail() == null</code> - Сите делови се <code>true</code></li><li><code>user == null</code>, <code>user.getPassword() == null</code>, <code>user.getEmail() != null</code></li><li><code>user == null</code>, <code>user.getPassword() != null</code>, <code>user.getEmail() == null</code></li><li><code>user == null</code>, <code>user.getPassword() != null</code>, <code>user.getEmail() != null</code></li><li><code>user != null</code>, <code>user.getPassword() == null</code>, <code>user.getEmail() == null</code></li><li><code>user != null</code>, <code>user.getPassword() == null</code>, <code>user.getEmail() != null</code></li><li><code>user != null</code>, <code>user.getPassword() != null</code>, <code>user.getEmail() == null</code></li><li><code>user != null</code>, <code>user.getPassword() != null</code>, <code>user.getEmail() != null</code> - Сите делови се <code>false</code></li></ol>

