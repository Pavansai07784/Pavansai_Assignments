class Account {
    constructor(id, name1, bal) {
        this.id = id;
        this.name1 = name1;
        this.bal = bal;
    }
}

class SavingsAccount extends Account {
    constructor(id, name1, bal, intrest, credit) {
        super(id, name1, bal);
        this.intrest = intrest;
        this.credit = credit
    }
    bal1( bal,intrest,credit ) {
        this.bal = bal;
        this.intrest =intrest;
        this.credit =credit;
        return this.bal * this.intrest*this.credit;

    }
}

class CurrentAccount extends Account {
    constructor(id, name1, bal, intrest, credit) {
        super(id, name1, bal);
        this.intrest = intrest;
        this.credit = credit;
    }
    bal2( bal,intrest,credit ) {
        this.bal = bal;
        this.intrest =intrest;
        this.credit =credit;
        return this.bal * this.intrest*this.credit*0.5;

    }
}


var acc1 = new SavingsAccount();
var acc2 = new CurrentAccount();

document.write(acc1.bal1(1,2,3));
console.log(acc1.bal1(1,2,3))



document.write(acc2.bal2(1,2,3));
console.log(acc2.bal2(1,2,3))

//# sourceMappingURL=A1Q8.js.map
