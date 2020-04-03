import queryString from "query-string";

const rootUrl = "https://www.fastmock.site/mock/9e79af5470296620a7bbffb1b5957510/mysh";

let myFetch = {
    get(url,queryParams){
        url = rootUrl+url;
        if(queryParams)
            url += "?"+queryString.stringify(queryParams);
        return fetch(url)
        .then(res=>res.json())
    },
    post(url,body){
        return fetch(rootUrl+url,{
            method:'POST',
            headers:{
                "Accept":'application/json',
                "Content-Type":'application/json'
            },
            body:JSON.stringify(body)
        })
        .then(res=>res.json())
    }
}
export {myFetch}