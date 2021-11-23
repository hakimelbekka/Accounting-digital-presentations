package Domain.Models.Enum;

import java.util.HashSet;

public class UserType {

    private int Id;
    private String Name;
    public UserType Admin = new UserType().SetId(1).SetName("Admin");
    public UserType Fiscal = new UserType().SetId(2).SetName("Fiscal");
    public UserType GeneralFiscal = new UserType().SetId(3).SetName("General Fiscal");
    public UserType Counters = new UserType().SetId(4).SetName("Counters");

    public UserType() {

    }

    public UserType SetId(int id) {
        this.Id = id;
        return this;
    }

    public UserType SetName(String name) {
        this.Name = name;
        return this;
    }

    public HashSet<UserType> GetAll() {
        HashSet<UserType> list = new HashSet<UserType>();
        list.add(Admin);
        list.add(Fiscal);
        list.add(GeneralFiscal);
        list.add(Counters);
        return list;
    }
}
