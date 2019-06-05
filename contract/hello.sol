pragma solidity >=0.4.16 <0.7.0;

contract Greeter {
    string public greeting;

    function test(uint t)  view public returns (uint) {
        return 100;
    }

    uint256[] public data;

    function getData(uint256 _u) public returns(uint256[] memory){
        data.push(_u);
        return data;
    }

    function setData(uint256[] memory _u) public pure returns(uint256[] memory){
        return _u;
    }

    function setSimpleData(bytes31[2] memory u) public pure returns(bytes31[2] memory){
        return u;
    }


    function greet() view public returns (string memory) {
        return greeting;
    }
}