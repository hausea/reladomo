/*
 Copyright 2016 Goldman Sachs.
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing,
 software distributed under the License is distributed on an
 "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 KIND, either express or implied.  See the License for the
 specific language governing permissions and limitations
 under the License.
 */

/* Generated By:JJTree: Do not edit this line. ASTOrExpression.java */


package com.gs.fw.common.mithra.generator.queryparser;

import com.gs.fw.common.mithra.generator.MithraGeneratorException;

import java.util.ArrayList;

public class ASTOrExpression extends SimpleNode {
    public ASTOrExpression(int id) {
        super(id);
    }

    public ASTOrExpression(MithraQL p, int id) {
        super(p, id);
    }


    /**
     * Accept the visitor. *
     */
    public Object jjtAccept(MithraQLVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    @Override
    public String constructFilterExpr()
    {
        ArrayList<String> list = new ArrayList(this.jjtGetNumChildren());
        for(int i=0;i<this.children.length;i++)
        {
            String child = ((SimpleNode)this.children[i]).constructFilterExpr();
            if (child != null && child.length() > 0)
            {
                list.add(child);
            }
        }
        if (list.isEmpty()) return "";
        if (list.size() != this.jjtGetNumChildren())
        {
            throw new MithraGeneratorException("An or clause in a relationship must not have a literal and non-literal combined");
        }
        String expr = "("+list.get(0)+")";
        for(int i=1;i<list.size();i++)
        {
            expr += " || (" + list.get(i)+")";
        }
        return expr;
    }
}
