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
    function Account(id, name1, balance) {
        this.id = id;
        this.name1 = name1;
        this.balance = balance;
    }
    return Account;
}());
var SavingsAccount = /** @class */ (function (_super) {
    __extends(SavingsAccount, _super);
    function SavingsAccount(id, name1, balance, intrest, credit) {
        var _this = _super.call(this, id, name1, balance) || this;
        _this.intrest = intrest;
        _this.credit = credit;
        return _this;
    }
    SavingsAccount.prototype.bal = function () {
        return "hi";
    };
    return SavingsAccount;
}(Account));
var acc = new SavingsAccount();
document.write(acc.bal());
//# sourceMappingURL=A1Q8.js.map
//# sourceMappingURL=A1Q8.js.map