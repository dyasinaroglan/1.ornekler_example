package Classes.Enum.Enum8;


//subclass
 class User {

  private String name;
  private Statü statü;
  private Role role;

    public User(String name, Statü statü, Role role) {
        this.name = name;
        this.statü = statü;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Statü getStatü() {
        return statü;
    }

    public void setStatü(Statü statü) {
        this.statü = statü;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", statü=" + statü +
                ", role=" + role +
                '}';
    }
}

enum Statü{
    AKTİF,SLEEP,INAKTİF;

}

enum Role{
    ADMİN, USER, GUEST;
}