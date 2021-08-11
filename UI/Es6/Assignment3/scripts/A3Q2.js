var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Account = /** @class */ (function () {
    function Account(id, name1, bal) {
        this.id = id;
        this.name1 = name1;
        this.bal = bal;
    }
    return Account;
}());
var SavingsAccount = /** @class */ (function (_super) {
    __extends(SavingsAccount, _super);
    function SavingsAccount(id, name1, bal, intrest, credit) {
        var _this = _super.call(this, id, name1, bal) || this;
        _this.intrest = intrest;
        _this.credit = credit;
        return _this;
    }
    SavingsAccount.prototype.bal1 = function (bal, intrest, credit) {
        this.bal = bal;
        this.intrest = intrest;
        this.credit = credit;
        return this.bal * this.intrest * this.credit;
    };
    return SavingsAccount;
}(Account));
var CurrentAccount = /** @class */ (function (_super) {
    __extends(CurrentAccount, _super);
    function CurrentAccount(id, name1, bal, intrest, credit) {
        var _this = _super.call(this, id, name1, bal) || this;
        _this.intrest = intrest;
        _this.credit = credit;
        return _this;
    }
    CurrentAccount.prototype.bal2 = function (bal, intrest, credit) {
        this.bal = bal;
        this.intrest = intrest;
        this.credit = credit;
        return this.bal * this.intrest * this.credit * 0.5;
    };
    return CurrentAccount;
}(Account));
var acc1 = new SavingsAccount();
var acc2 = new CurrentAccount();
document.write(acc1.bal1(1, 2, 3));
console.log(acc1.bal1(1, 2, 3));
document.write(acc2.bal2(1, 2, 3));
console.log(acc2.bal2(1, 2, 3));
//# sourceMappingURL=A3Q2.js.map