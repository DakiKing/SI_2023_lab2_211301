public static boolean function(User user, List<User> allUsers) {
    // Complexity 1: if statement
    if (user == null || user.getPassword() == null || user.getEmail() == null) {
        // Complexity 2: throw statement
        throw new RuntimeException("Mandatory information missing!");
    }

    // Complexity 3: if statement
    if (user.getUsername() == null) {
        // Complexity 4: method call
        user.setUsername(user.getEmail());
    }

    // Complexity 5: initialization
    int same = 1;

    // Complexity 6: if statement
    if (user.getEmail().contains("@") && user.getEmail().contains(".")) {
        // Complexity 7: assignment
        same = 0;
        
        // Complexity 8: for loop (size-dependent)
        for (int i = 0; i < allUsers.size(); i++) {
            // Complexity 9: method call
            User existingUser = allUsers.get(i);

            // Complexity 10: if statement
            if (existingUser.getEmail() == user.getEmail()) {
                // Complexity 11: increment
                same += 1;
            }

            // Complexity 12: if statement
            if (existingUser.getUsername() == user.getUsername()) {
                // Complexity 13: increment
                same += 1;
            }
        }
    }

    // Complexity 14: initialization
    String specialCharacters = "!#$%&'()*+,-./:;<=>?@[]^_`{|}";
    
    // Complexity 15: method call
    String password = user.getPassword();
    
    // Complexity 16: method call
    String passwordLower = password.toLowerCase();

    // Complexity 17: if statement
    if (passwordLower.contains(user.getUsername().toLowerCase()) || password.length() < 8) {
        return false;
    } else {
        // Complexity 18: if statement
        if (!passwordLower.contains(" ")) {
            // Complexity 19: for loop (size-dependent)
            for (int i = 0; i < specialCharacters.length(); i++) {
                // Complexity 20: if statement
                if (password.contains(String.valueOf(specialCharacters.charAt(i)))) {
                    // Complexity 21: if statement (dependent on 'same')
                    return same == 0;
                }
            }
        }
    }

    // Complexity 22: default return
    return false;
}
