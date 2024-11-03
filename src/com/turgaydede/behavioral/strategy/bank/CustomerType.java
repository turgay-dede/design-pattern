package com.turgaydede.behavioral.strategy.bank;

public enum CustomerType {
    STANDARD {
        @Override
        public InterestStrategy getInterestStrategy() {
            return new StandardInterestStrategy();
        }
    },
    PREMIUM {
        @Override
        public InterestStrategy getInterestStrategy() {
            return new PremiumInterestStrategy();
        }
    },
    CAMPAIGN {
        @Override
        public InterestStrategy getInterestStrategy() {
            return new CampaignInterestStrategy();
        }
    };

    public abstract InterestStrategy getInterestStrategy();
}
