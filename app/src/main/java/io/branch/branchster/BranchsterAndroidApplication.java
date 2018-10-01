package io.branch.branchster;

import android.app.Application;

import java.util.Random;
import java.util.UUID;

import io.branch.referral.Branch;

/**
 * Created by sahilverma on 3/7/17.
 */

public class BranchsterAndroidApplication extends Application {
    public void onCreate() {
        super.onCreate();
        Branch branch = Branch.getAutoInstance(this);
        Branch.enableLogging();
        Branch.setPlayStoreReferrerCheckTimeout(3000);
        branch.setIdentity(UUID.randomUUID().toString());
    }
}
