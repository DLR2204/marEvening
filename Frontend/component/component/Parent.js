import { Component } from "react";
import './Style.css'
export class Parent extends Component{

        state={}

        getData=(id,name,price,type)=>{
            this.setState({
                id:id,
                name:name,
                price:price,
                type:type,
            })
        }

    render(){
        return(<div className="Parent">
            <center><h1>Im from the Parent Component</h1></center>

                <h3>Product Id:- {this.state.id}</h3>
                <h3>Product Name:-{this.state.name} </h3>
                <h3>Product Price:- {this.state.price}</h3>
                <h3>Product Type:- {this.state.type}</h3>

            <Child1  onChange={this.getData}/>
        </div>);
    }
}

export class Child1 extends Component{

    state = {pid:100,pname:"apple",pprice:28374,ptype:"mobile"}

    sendData=()=>{
        this.props.onChange(this.state.pid,this.state.pname,this.state.pprice,this.state.ptype)
    }

    render(){
        return(<div className="Child">

            <center><h1> Im from the Child Component</h1></center>

            <button type="button" onClick={this.sendData}>SendData</button>
        </div>);
    }
}