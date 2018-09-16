package a15961.arit.com.neww;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import a15961.arit.com.neww.model.Product;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder>{
    private List<Product> products;

//    private Context context;
    ProductAdapter(List<Product> products){
        this.products = products;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//        return null;
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item,viewGroup,false);
        return new ViewHolder(v);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.productCode.setText(this.products.get(i).getProductCode());
        viewHolder.productName.setText(this.products.get(i).getProductName());
    }

    @Override
    public int getItemCount() {
        return this.products.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.tvProductCode) TextView productCode;
        @BindView(R.id.tvProductName) TextView productName;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
