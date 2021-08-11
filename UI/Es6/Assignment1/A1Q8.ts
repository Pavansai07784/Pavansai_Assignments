class Account {
    constructor(id, name1, balance) {
        this.id = id;
        this.name1 = name1;
        this.balance = balance;
    }
}

class SavingsAccount extends Account {
    constructor(id, name1, balance, intrest, credit) {
        super(id, name1, balance);
        this.intrest = intrest;
        this.credit = credit
    }
    bal() {
      
        return "hi";

    }
}


var acc = new SavingsAccount();

document.write(acc.bal());


//# sourceMappingURL=A1Q8.js.map