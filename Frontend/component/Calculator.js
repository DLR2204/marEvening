import {Component} from 'react';

class Calculator extends Component{

    state ={a:30,b:20}

    render(){
            return(
                <div>
                    
                    <center>  <h1><u>Calculator</u></h1></center><h2><br/><br/> 

A:- <input type="text " value={this.state.a}/>

B:- <input type="text " value={this.state.b}/></h2> <br/><br/> 

                   <h3>

             Add:-  {this.state.a + this.state.b}

 <br/><br/>   Sub:- {this.state.a - this.state.b}

 <br/> <br/>   Div:- {this.state.a / this.state.b}

 <br/><br/>    Mul:- {this.state.a * this.state.b}

 <br/></h3>

                </div>
            );
    }
}

export default Calculator;