function add(a, b) {
    if (a === void 0) { a = 20; }
    if (b === void 0) { b = 30; }
    document.write("a= " + a + " b= " + b);
}
add();
function userFriends(username, _a) {
    var friends = _a.slice(0);
    document.writeln(" username is " + username + " his friends are " + friends);
}
userFriends("Mike", ["lilly", "June", "amigo", "<br>"]);
function printCapitalName() {
    var name = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        name[_i] = arguments[_i];
    }
    return name;
}
document.write(" " + printCapitalName("Mike", "lilly", "Ben", "June", "Amigo"));
//# sourceMappingURL=A1Q5.js.map